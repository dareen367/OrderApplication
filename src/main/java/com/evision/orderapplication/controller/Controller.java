/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evision.orderapplication.controller;

import org.springframework.web.bind.annotation.RestController;
import com.evision.orderapplication.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Hamada Salim G Trd
 */
@RestController
@RequestMapping("/orders")
public class Controller {

    @Autowired
    private OrderService orderService;
    @PutMapping("/{id}")
    public String updateOrder(@PathVariable("id") int orderId) {
        orderService.UpdateOrderService(); 
        return "Order with ID " + orderId + " updated successfully";
    }
}