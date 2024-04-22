package arturmatos;

import java.lang.annotation.Annotation;

public class MetodoPrincipalReflection {

	public static void main(String[] args) {
		Class<?> clazz = Usuario.class;
		
		Annotation[] annotations = clazz.getAnnotations();
		
		for (Annotation annotation : annotations) {
            if (annotation instanceof Tabela) {
            	Tabela myAnnotation = (Tabela) annotation;
                System.out.println("Nome da @interface: " + myAnnotation.annotationType().getSimpleName());
            }
        }
    }
}
		


