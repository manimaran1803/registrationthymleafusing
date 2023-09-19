package register.registerationformthymleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import register.registerationformthymleaf.model.user;

public interface userrepo extends JpaRepository<user,Long> {
    
}
