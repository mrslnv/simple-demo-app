package training.account;

import javax.persistence.*;
import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Map;

@Repository
@Transactional(readOnly = true)
public class AccountRepository {

//story #1003	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Inject
	private PasswordEncoder passwordEncoder;
	
	@Transactional
	public Account save(Account account) {
		account.setPassword(passwordEncoder.encode(account.getPassword()));
		entityManager.persist(account);
		return account;
	}
	
	public Account findByUsername(String username) {
		try {
			return entityManager.createNamedQuery(Account.FIND_BY_USERNAME, Account.class)
					.setParameter("username", username)
					.getSingleResult();
		} catch (PersistenceException e) {
			return null;
		}
	}


    public Account findById(long id) {
        try {
            return entityManager.createNamedQuery(Account.FIND_BY_USERNAME, Account.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (PersistenceException e) {
            return null;
        }
    }


	public Account findWithPreferences(Map<String,String> preferences) {
		try {
			TypedQuery<Account> query = entityManager.createNamedQuery(Account.FIND_WITH_PREF, Account.class);
			for (Map.Entry<String,String>  ent : preferences.entrySet()) {
				query.setParameter("pref_"+ent.getKey(),ent.getValue());
			}
			return query.getSingleResult();
		} catch (PersistenceException e) {
			return null;
		}
	}
}
