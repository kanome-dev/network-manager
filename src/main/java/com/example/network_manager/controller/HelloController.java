package com.example.network_manager.controller;

import com.example.network_manager.entity.Device;
import com.example.network_manager.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable; // 追加

@Controller
public class HelloController {

    @Autowired
    private DeviceRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("devices", repository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addDevice(Device device) {
        repository.save(device);
        return "redirect:/";
    }

    // ★追加：削除ボタンが押された時の処理
    @PostMapping("/delete/{id}")
    public String deleteDevice(@PathVariable("id") Long id) {
        // 指定されたIDのデータをデータベースから削除
        repository.deleteById(id);
        // 削除が終わったら一覧画面に戻る
        return "redirect:/";
    }
}