package com.ilys.molarservices.Repository;

import com.ilys.molarservices.Model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long> {
    List<Quote> findAllByIdAndActive(Long id, int active);
}
