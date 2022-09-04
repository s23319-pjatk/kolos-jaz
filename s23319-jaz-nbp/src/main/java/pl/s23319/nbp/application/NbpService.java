package pl.s23319.nbp.application;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpService {

    final Repository repository;
    final RestTemplate restTemplate;
    NbpService(Repository repository, RestTemplate restTemplate){
        this.repository=repository;
        this.restTemplate=restTemplate;
    }

    public NbpEntity getWaluta( String code,String waluta, String startDate, String endDate) {
        NbpEntity exchange = restTemplate.getForEntity("http://api.nbp.pl/api/exchangerates/rates/" + code
                +"/"+waluta+"/"+startDate+"/"+endDate+"/", NbpEntity.class).getBody();
        return repository.save(exchange);

    }

    public String getZloto() {
        String exchange = restTemplate.getForEntity("https://api.nbp.pl/api/cenyzlota/", String.class).getBody();

        return exchange;

    }

}

