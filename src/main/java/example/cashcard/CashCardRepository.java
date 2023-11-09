package example.cashcard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CashCardRepository extends CrudRepository<CashCard, Long>, PagingAndSortingRepository<CashCard, Long> {
    CashCard findByIdAndOwner(Long id, String owner);

    Page<CashCard> findByOwner(String owner, PageRequest pageRequest);
/**
 * We added logic to the Controller method to check whether the Cash Card ID in the request actually exists in the database. 
 * The method we'll use is CashCardRepository.existsByIdAndOwner(id, username).
 */
    boolean existsByIdAndOwner(Long id, String owner);
}
