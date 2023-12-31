package models;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MachineEventDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private Long machineId;
	private String machineName; 
	private  String machineStatus;
	private String machineType;
	
	
	public MachineEventDTO(CreateMachineRequest request) {
		super();
		this.machineId = request.machineId();
		this.machineName = request.machineName();
		this.machineStatus = request.machineStatus();
		this.machineType = request.machineType();
	}

	
	
}
