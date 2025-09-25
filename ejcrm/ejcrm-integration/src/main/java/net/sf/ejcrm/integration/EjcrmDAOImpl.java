package net.sf.ejcrm.integration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;


@Transactional
public class EjcrmDAOImpl implements EjcrmDAO {
	private EntityManager em;

	// Spring will inject this:
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public String getLicense() {
		return "GPL";
	}

	@Transactional(readOnly = true)
	public String getVersion() {
		return "1.0";
	}

}
