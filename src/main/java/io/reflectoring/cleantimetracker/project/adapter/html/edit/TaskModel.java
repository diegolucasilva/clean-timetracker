package io.reflectoring.cleantimetracker.project.adapter.html.edit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
class TaskModel {

  private Long id;

  private String name;

  private Boolean invoiceable;

}
