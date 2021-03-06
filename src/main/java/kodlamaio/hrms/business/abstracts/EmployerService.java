package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface EmployerService {

	DataResult<List<Employer>> getAll();

	Result add(Employer employer);
	
	Result update(Employer employer,int id);
	
	DataResult<Employer> getByEmployerId(int id);
	
	

}
