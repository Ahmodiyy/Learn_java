package LanguageBasics;
import java.lang.annotation.Documented;
@Documented
@interface enumAnot{
    String tation();
}
@enumAnot(tation = "tation")
class AnnotationDemo {

}