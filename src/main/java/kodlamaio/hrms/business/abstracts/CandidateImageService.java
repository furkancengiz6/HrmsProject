package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateImage;

public interface CandidateImageService {
	Result add(CandidateImage candidateImage);
	Result add(CandidateImage candidateImage,MultipartFile multipartFile);
	Result addAll(List<CandidateImage> candidateImages);
	
	DataResult<List<CandidateImage>> getAll();
	
	DataResult<List<CandidateImage>> getAllByCandidateId(int candidateId);
}
