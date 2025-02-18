package com.alibou.security.auditing;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @CreatedDate()
    @Column(nullable = false,
            updatable = false)
    private LocalDateTime dateCreated;
    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime dateUpdated;
    @CreatedBy
    @Column(nullable = false,
            updatable = false)
    private Integer createdBy;
    @LastModifiedBy()
    @Column(insertable = false)
    private Integer updatedBy;
}
