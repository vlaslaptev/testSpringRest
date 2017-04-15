package test.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.entity.First;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "first", path = "first")
public interface FirstRepository extends PagingAndSortingRepository<First, Long> {

	List<First> findAllBySecondField(@Param("SecondField") Integer secondField);

}
