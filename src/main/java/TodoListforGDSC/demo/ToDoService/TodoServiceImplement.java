package TodoListforGDSC.demo.ToDoService;

import TodoListforGDSC.demo.ToDoEntity.ToDoEntity;
import TodoListforGDSC.demo.ToDoRepository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class TodoServiceImplement implements TodoServiceInterface {
    @Autowired
    private TodoRepository ToDoRepositoryInterface;

    public ToDoEntity postTask(ToDoEntity task) {
        return ToDoRepositoryInterface.save(task);
    }

    public List<ToDoEntity> showAllTask() {
        return ToDoRepositoryInterface.findAll();
    }

    public void deleteTask(Long id){
        ToDoRepositoryInterface.deleteById(id);
    }

    public ToDoEntity updateTask(ToDoEntity task, Long id) {
        task.setId(id);
        return ToDoRepositoryInterface.save(task);
    }

    public boolean exist(Long id) {
        return ToDoRepositoryInterface.existsById(id);
    }


}
