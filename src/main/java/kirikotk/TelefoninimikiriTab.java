package kirikotk;

import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
public interface TelefoninimikiriTab extends CrudRepository<telefoninimekiri, Integer> {

}