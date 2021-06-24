package com.aemo.annotations;
import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@SupportedAnnotationTypes("com.annotations.MSATS_Enum")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class MSATS_EnumProcessor extends AbstractProcessor {
    @Override
    public boolean process(final Set<? extends TypeElement> annotations, final RoundEnvironment roundEnv) {
        for (TypeElement annotation: annotations){
            Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
            final String qualifiedName = ((TypeElement) annotatedElements.stream().findAny().get()).getQualifiedName().toString();
            final MSATS_Enum msats_enum = annotation.getAnnotation(MSATS_Enum.class);
            try {
                writeBuilderFile(qualifiedName,msats_enum.className(), msats_enum.properties());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("annotations = " + annotations + ", roundEnv = " + roundEnv);
        }
        System.out.println("annotations ");
        return true;
    }

    private void writeBuilderFile(String parentClass, String className, String[] props) throws IOException {
        final JavaFileObject sourceFile = processingEnv.getFiler().createSourceFile(className);

        String packageName = null;
        if(className.lastIndexOf('.') != -1) {
            packageName = className.substring(0, className.lastIndexOf('.'));
        }
        try(PrintWriter writer = new PrintWriter(sourceFile.openWriter())) {
            if(packageName != null){
                writer.print("package "+packageName+";");
                writer.println();
            }
            writer.print("public class "+className+" extends "+parentClass+" {");
            writer.println();
            writer.print("}");


        }
    }
}
