package br.com.caelum.stella.validation;

/**
 * @author Leonardo Bessa
 */

class RotinaParameters {
    private final DigitoVerificadorInfo digitoVerificadorInfo;
    private final Integer[] numeros;
    private Integer result;

    public RotinaParameters(DigitoVerificadorInfo digitoVerificadorInfo,
            Integer[] numeros, Integer result) {
        super();
        this.digitoVerificadorInfo = digitoVerificadorInfo;
        this.numeros = numeros;
        this.result = result;
    }

    public DigitoVerificadorInfo getDigitoVerificadorInfo() {
        return digitoVerificadorInfo;
    }

    public Integer[] getNumeros() {
        return numeros;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}
