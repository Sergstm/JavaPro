package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SpringBootApplication
public class MainController {
    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }

    private Map<Long, byte[]> photos = new HashMap<>();

    @RequestMapping("/")
    public String onIndex() {
        return "index";
    }

    @RequestMapping("/add_photo")
    public String onResult(@RequestParam MultipartFile photo, Model model) {
        if (photo.isEmpty()) {
            throw new PhotoErrorExeption();
        }

        try {
            long id = System.currentTimeMillis();
            photos.put(id, photo.getBytes());
            model.addAttribute("photo_id", id);
        } catch (IOException e) {
            throw new PhotoErrorExeption();
        }
        return "result";
    }

    @RequestMapping("/view")
    public ResponseEntity<byte[]> onView(@RequestParam("photo_id") long id) {
        return photoById(id);
    }

    @RequestMapping("/delete/{photo_id}")
    public String onDelete(@PathVariable("photo_id") long id) {
        if (photos.remove(id) == null) {
            throw new PhotoNotFoundExeption();
        } else {
            return "index";
        }
    }

    @RequestMapping("/del_group")
    public String onDel(@RequestParam("photo_id") List<Long> id) {
        for (Long elem : id) {
            if (photos.remove(elem) == null) {
                throw new PhotoNotFoundExeption();
            }
        }
        return "index";
    }

    @RequestMapping("/list")
    public String onList(Model model) {
        model.addAttribute("photo_ids", photos.keySet());
        return "list";
    }

    @RequestMapping("/{photo_id}")
    public ResponseEntity<byte[]> onPhoto(@PathVariable("photo_id") long id) {
        return photoById(id);
    }

    private ResponseEntity<byte[]> photoById(long id) {
        byte[] bytes = photos.get(id);
        if (bytes == null) {
            throw new PhotoNotFoundExeption();
        }
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(bytes);
    }


}
