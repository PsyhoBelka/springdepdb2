package ua.rozhkov.springdepdb.service;

import org.springframework.stereotype.Service;
import ua.rozhkov.springdepdb.DAO.entity.core.Period;
import ua.rozhkov.springdepdb.DAO.repository.PeriodRepository;

import java.util.List;

@Service
public class PeriodService implements BaseService<Period, Long> {
    private PeriodRepository periodRepository;

    public PeriodService(PeriodRepository periodRepository) {
        this.periodRepository = periodRepository;
    }

    @Override
    public Period findById(Long id) {
        return periodRepository.findPeriodById(id);
    }

    @Override
    public List<Period> findAll() {
        return periodRepository.findAll();
    }

    @Override
    public Period findByName(String name) {
        return periodRepository.findPeriodByName(name);
    }

    @Override
    public Period save(Period period) {
        return periodRepository.saveAndFlush(period);
    }

    @Override
    public void deleteById(Long id) {
        periodRepository.deleteById(id);
    }
}
