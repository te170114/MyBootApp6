package jp.te4a.spring.boot.myapp12;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WritterValidator implements ConstraintValidator<Writter,String>{
	String ok;
	@Override
	public void initialize(Writter w) {ok = w.ok();}
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt) {
		if(in == null) {
			return false;
		}
		System.out.println(in.equals(ok));
		return in.equals(ok);
	}
}
