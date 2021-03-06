package com.pe.web.cine.app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomRequest {
	
	private Integer codCinema;
	private Integer numRow;
	private Integer numSeat;
	private Integer numRoom;

}
