package endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iesp.entity.Address;
import br.edu.iesp.property.AddressProperty;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
@RequestMapping("query")
public class AddressController {

	@Autowired
	private AddressProperty addressProperty;
		
	@ApiOperation(value= " Show viacep address by code", response = Iterable.class)
	@GetMapping(path = "{code}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Address getDefaultAddress(@PathVariable("code")String code) {
		return new Address();
	}
}
