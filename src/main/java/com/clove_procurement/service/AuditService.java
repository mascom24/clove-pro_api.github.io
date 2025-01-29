package com.clove_procurement.service;

import com.clove_procurement.model.Audit;
import com.clove_procurement.model.Customer;
import com.clove_procurement.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditService {
    @Autowired
    private AuditRepository repository;
    public List<Audit> getAllAudit(){
        return repository.findAll();
    }
    public Audit getAuditById(Long auditId){
        return repository.findById(auditId).orElse(null);
    }

    public Audit getAuditByCustomerName(String customerName){
        return repository.getAuditByCustomerName(customerName);
    }
    public Audit registerAudit(Audit audit){
        return repository.save(audit);
    }
    public void deleteAuditById(Long auditId){
        repository.deleteById(auditId);
    }
    public Audit updateAudit(Long auditId,Audit audit){
        Audit audit1=repository.findById(auditId).get();
        audit1.setCustomerName(audit.getCustomerName());
        audit1.setQuantity(audit.getQuantity());
        audit1.setDryness(audit.getDryness());
        audit1.setCLean(audit.getCLean());
        audit1.setGrade(audit.getGrade());
        return repository.save(audit1);
    }
}
