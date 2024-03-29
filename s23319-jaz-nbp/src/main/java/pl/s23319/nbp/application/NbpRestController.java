package pl.s23319.nbp.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nbp")
public class NbpRestController {
    final NbpService nbpservice;

    public NbpRestController(NbpService nbpservice) {
        this.nbpservice = nbpservice;
    }

    @GetMapping("/waluta/{code}/{waluta}/{startDate}/{endDate}")
    public NbpEntity all(@PathVariable String code, @PathVariable String waluta, @PathVariable  String startDate, @PathVariable String endDate){
        return nbpservice.getWaluta(code,waluta,startDate,endDate);
    }
    @GetMapping("/zloto")
    public String all2(){
        return nbpservice.getZloto();
    }

}