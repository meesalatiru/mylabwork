package net.sf.ejcrm.business;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EjcrmServiceImpl implements EjcrmService {
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
