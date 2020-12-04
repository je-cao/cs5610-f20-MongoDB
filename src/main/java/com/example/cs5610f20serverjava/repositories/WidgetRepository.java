package com.example.cs5610f20serverjava.repositories;

import com.example.cs5610f20serverjava.models.Widget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WidgetRepository
    extends CrudRepository<Widget, Integer> {

    @Query("select widget from Widget widget where topicId=:topicId")
    public List<Widget> findWidgetsForTopic(
            @Param("topicId") String topicId);
}
