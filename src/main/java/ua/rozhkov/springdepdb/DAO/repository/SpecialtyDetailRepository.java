package ua.rozhkov.springdepdb.DAO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.rozhkov.springdepdb.DAO.entity.SpecialtyDetail;

public interface SpecialtyDetailRepository extends JpaRepository<SpecialtyDetail, Long> {
    public SpecialtyDetail findSpecialtyDetailById(Long id);

    //    @Query("")
    public void deleteSpecialtyDetailById(Long id);
}
