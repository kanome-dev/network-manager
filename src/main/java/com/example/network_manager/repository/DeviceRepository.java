package com.example.network_manager.repository;

import com.example.network_manager.entity.Device;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
    // これだけで、データの保存・削除・検索ができるようになります！
}
