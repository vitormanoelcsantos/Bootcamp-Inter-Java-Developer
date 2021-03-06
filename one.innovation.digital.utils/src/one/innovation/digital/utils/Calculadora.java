package one.innovation.digital.utils;

import one.innovation.digital.utils.internals.DivHelper;
import one.innovation.digital.utils.internals.MultHelper;
import one.innovation.digital.utils.internals.SubHelper;
import one.innovation.digital.utils.internals.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public Integer soma(Integer a, Integer b){
        return sumHelper.execute(a, b);
    }
    public Integer subtracao(Integer a, Integer b){
        return subHelper.execute(a, b);
    }
    public Integer divisao(Integer a, Integer b){
        return divHelper.execute(a, b);
    }
    public Integer multiplicacao(Integer a, Integer b){
        return multHelper.execute(a, b);
    }
}
