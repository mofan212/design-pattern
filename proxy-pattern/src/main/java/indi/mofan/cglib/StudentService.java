package indi.mofan.cglib;

/**
 * @author mofan
 * @date 2021/10/10 17:57
 */
public class StudentService {
    public void create(Student student) {
        System.out.println("StudentService.create");
    }

    public void delete(Long id) {
        System.out.println("StudentService.delete");
    }
}
