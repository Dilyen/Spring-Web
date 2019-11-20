package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {

    @Autowired
    private Maths maths;
    private static final String results = "Sub of two num is %d ";

    @RequestMapping("/sub")
    public Number sub(@RequestParam(value ="int1") String int1,
                      @RequestParam(value = "int2") String int2) {
        Integer a  =  Integer.parseInt(int1);
        Integer b  =  Integer.parseInt(int2);
        return new Number(a - b);
    }

    @RequestMapping("/add")
    public Number add(@RequestParam(value = "int1") String int1,
                    @RequestParam(value = "int2") String int2){
        Integer a = Integer.parseInt(int1);
        Integer b = Integer.parseInt(int2);

        return new Number(a+b);
    }


}

