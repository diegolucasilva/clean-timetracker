package io.reflectoring.cleantimetracker.projectcontext.domain.usecase;

import java.util.Optional;

import io.reflectoring.cleantimetracker.projectcontext.domain.entity.Task;
import io.reflectoring.cleantimetracker.projectcontext.domain.entity.TaskId;
import io.reflectoring.cleantimetracker.projectcontext.domain.entity.TaskStatus;

public class TaskTestFactory {

  public static Optional<Task> defaultTask() {
    return Optional.of(Task.builder()
            .name("Task 1")
            .id(TaskId.of(1L))
            .project(ProjectTestFactory.defaultProject().get())
            .invoiceable(Boolean.TRUE)
            .status(TaskStatus.ACTIVE)
            .build());

  }

}
