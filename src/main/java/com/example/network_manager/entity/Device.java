package com.example.network_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;          // 自動で割り振られる番号

    private String name;      // 機器名（例：基幹ルーター）
    private String ipAddress; // IPアドレス（例：192.168.1.1）
    private String location;  // 設置場所（例：福島データセンター）

    // ここから下は、プログラムがデータを読み書きするための「部品」です
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}