package com.sctrcd.supermini.repositories;

import com.sctrcd.supermini.domain.Version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 11/2/2016.
 */
@Repository
public interface JpaVersionRepository extends JpaRepository<Version, String> {
}
