package com.Credentials.Repository;

import com.Credentials.Model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
    // Additional methods if needed
}
