package com.clove_procurement.controller;

import com.clove_procurement.model.Audit;
import com.clove_procurement.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/clove-pro/Audit")
@CrossOrigin(origins = "*")
public class AuditController {
    @Autowired
    private AuditService service;
    @GetMapping
    public List<Audit> getAllAudit(){
        return service.getAllAudit();
    }
    @GetMapping("/{auditId}")
    public Audit getAuditById(@PathVariable Long auditId){
        return service.getAuditById(auditId);
    }
    @PostMapping
    public Audit registerAudit(@RequestBody Audit audit){
        return service.registerAudit(audit);
    }
    @DeleteMapping("/{auditId}")
    public void deleteAuditById(@PathVariable Long auditId){
        service.deleteAuditById(auditId);
    }
    @PutMapping("/{auditId}")
    public ResponseEntity<Audit> updateAudit(@PathVariable Long auditId,@RequestBody Audit audit){
        Audit updateAudit=service.updateAudit(auditId,audit);
        return ResponseEntity.ok(updateAudit);
    }
}
