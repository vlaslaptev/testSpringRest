package test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.entity.Second;

import java.math.BigDecimal;
import java.util.List;

@RepositoryRestResource
public interface SecondRepository extends PagingAndSortingRepository<Second, Long> {

	List<Second> findAllByThirdField(@Param("ThirdField") BigDecimal ThirdField);

}
