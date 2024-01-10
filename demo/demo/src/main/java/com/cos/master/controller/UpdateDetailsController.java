package com.cos.master.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.master.entities.ResponseObject;
import com.cos.master.service.UserService;
import com.cos.master.utils.AppUtils;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping(value = "/update")
public class UpdateDetailsController {

	@Autowired
	UserService userService;
	
	@Autowired
	AppUtils  appUtils;
 
	@PostMapping("/updateFatherName")
	public ResponseObject updateFatherName(@RequestBody String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Map<String, Object> map = null;
			map = mapper.readValue(json, Map.class);
			int id = (int) map.get("id");
			String father_name = (String) map.get("father_name");
			int updateDetails = userService.updateFatherName(father_name, id);
			if(updateDetails != 0) {
				return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
			}
			return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
		} catch (Exception e) {
			return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
		}
	

}
	
	@PostMapping("/updateAge")
	public ResponseObject updateAge(@RequestBody String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Map<String, Object> map = null;
			map = mapper.readValue(json, Map.class);
			int id = (int) map.get("id");
			int father_age = (int) map.get("father_age");
			int updateDetails = userService.updateAge(father_age, id);
			if(updateDetails != 0) {
				return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
			}
			return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
		} catch (Exception e) {
			return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
		}
	}	
		
		@PostMapping("/upadteFatherOccupation")
		public ResponseObject upadteFatherOccupation(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String father_occupation = (String) map.get("father_occupation");
				int updateDetails = userService.upadteFatherOccupation(father_occupation, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		
		
}
		
		@PostMapping("/upadteMotherName")
		public ResponseObject upadteMotherName(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String mother_Name = (String) map.get("mother_Name");
				int updateDetails = userService.upadteMotherName(mother_Name, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		
		
}
		
		@PostMapping("/updateMotherAge")
		public ResponseObject updateMotherAge(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				int mother_Name = (int) map.get("mother_Name");
				int updateDetails = userService.updateMotherAge(mother_Name, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		}
		
		@PostMapping("/upadteMotherOccupation")
		public ResponseObject upadteMotherOccupation(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String mother_occupation = (String) map.get("mother_occupation");
				int updateDetails = userService.upadteMotherOccupation(mother_occupation, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		
		
}
		
		@PostMapping("/upadteSpouseName")
		public ResponseObject upadteSpouseName(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String spouse_name = (String) map.get("spouse_name");
				int updateDetails = userService.upadteSpouseName(spouse_name, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		
		
}
		
		
		@PostMapping("/updateSpouseAge")
		public ResponseObject updateSpouseAge(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				int spouse_age = (int) map.get("spouse_age");
				int updateDetails = userService.updateSpouseAge(spouse_age, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		
		
}
		
		@PostMapping("/updateSpouseOccupation")
		public ResponseObject updateSpouseOccupation(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String spouse_occupation = (String) map.get("spouse_occupation");
				int updateDetails = userService.updateSpouseOccupation(spouse_occupation, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		
		
}
		
//		@PostMapping("/updateNominee1Name")
//		public ResponseObject updateNominee1Name(@RequestBody String json) {
//			ObjectMapper mapper = new ObjectMapper();
//			try {
//				Map<String, Object> map = null;
//				map = mapper.readValue(json, Map.class);
//				int id = (int) map.get("id");
//				String nominee1_name = (String) map.get("nominee1_name");
//				int updateDetails = userService.updateNominee1Name(nominee1_name, id);
//				if(updateDetails != 0) {
//					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
//				}
//				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
//			} catch (Exception e) {
//				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
//			}
		
		

//		@PostMapping("/updateNominee2Name")
//		public ResponseObject updateNominee2Name(@RequestBody String json) {
//			ObjectMapper mapper = new ObjectMapper();
//			try {
//				Map<String, Object> map = null;
//				map = mapper.readValue(json, Map.class);
//				int id = (int) map.get("id");
//				String nominee2_name = (String) map.get("nominee2_name");
//				int updateDetails = userService.updateNominee2Name(nominee2_name, id);
//				if(updateDetails != 0) {
//					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
//				}
//				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
//			} catch (Exception e) {
//				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
//			}
//		
//		
//}
		@PostMapping("/updateOtherNomineeName")
		public ResponseObject updateOtherNomineeName(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String other_nominee_name = (String) map.get("other_nominee_name");
				int updateDetails = userService.updateOtherNomineeName(other_nominee_name, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		
		
}
		
		@PostMapping("/updateOtherNomineeAge")
		public ResponseObject updateOtherNomineeAge(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				int other_nominee_age = (int) map.get("other_nominee_age");
				int updateDetails = userService.updateOtherNomineeAge(other_nominee_age, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		}	
		
		
		@PostMapping("/updateotherNomineeOccupation")
		public ResponseObject updateotherNomineeOccupation(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String other_nominee_occupation = (String) map.get("other_nominee_occupation");
				int updateDetails = userService.updateOtherNomineeOccupation(other_nominee_occupation, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		}	
		
	
//		@PostMapping("/updateOtherNomineeRelation")
//		public ResponseObject updateOtherNomineeRelation(@RequestBody String json) {
//			ObjectMapper mapper = new ObjectMapper();
//			try {
//				Map<String, Object> map = null;
//				map = mapper.readValue(json, Map.class);
//				int id = (int) map.get("id");
//				String other_nominee_relation = (String) map.get("other_nominee_relation");
//				int updateDetails = userService.updateOtherNomineeRelation(other_nominee_relation, id);
//				if(updateDetails != 0) {
//					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
//				}
//				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
//			} catch (Exception e) {
//				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
//			}
//		}	
		
//		@PostMapping("/updateSelectNumberOfChildren")
//		public ResponseObject updateSelectNumberOfChildren(@RequestBody String json) {
//			ObjectMapper mapper = new ObjectMapper();
//			try {
//				Map<String, Object> map = null;
//				map = mapper.readValue(json, Map.class);
//				int id = (int) map.get("id");
//				int select_number_of_children = (int) map.get("select_number_of_children");
//				int updateDetails = userService.updateSelectNumberOfChildren(select_number_of_children, id);
//				if(updateDetails != 0) {
//					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
//				}
//				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
//			} catch (Exception e) {
//				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
//			}
//		}	
		
		@PostMapping("/updatePastSurgeries")
		public ResponseObject updatePastSurgeries(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String past_surgeries = (String) map.get("past_surgeries");
				int updateDetails = userService.updatePastSurgeries(past_surgeries, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		}	
		
		@PostMapping("/updateBloodPressure")
		public ResponseObject updateBloodPressure(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String blood_pressure = (String) map.get("blood_pressure");
				int updateDetails = userService.updateBloodPressure(blood_pressure, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		}
		
		@PostMapping("/updateDiabetes")
		public ResponseObject updateDiabetes(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String diabetes = (String) map.get("diabetes");
				int updateDetails = userService.updateDiabetes(diabetes, id);
				if(updateDetails != 0) {
					return appUtils.prepareResponse("address updated sucessfully", "success", "200", 1, null);
				}
				return appUtils.prepareResponse("address cannot be sucessfull", "Failed", "400", 0, null);
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
		}	
		@PostMapping("/updateAddress")
		public ResponseObject updateAddress(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String address = (String) map.get("address");
				if(address != null && id != 0 && !address.isEmpty()) {
					int updateDetails = userService.updateAddress(address, id);
					if(updateDetails != 0) {
						return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
					}
					return appUtils.prepareResponse("Data not updated sucessfull", "Failed", "400", 0, null);
				}
			} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
			return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);
		}	
			
		@PostMapping("/updateGender")
		public ResponseObject updateGender(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
				int id = (int) map.get("id");
				String gender = (String) map.get("gender");
				if(gender != null && id != 0 && !gender.isEmpty()) {
				int updateDetails = userService.updateGender(gender, id);
				if (updateDetails != 0) {
					return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
				}

				return appUtils.prepareResponse(" Data not Updated sucessfull", "Failed", "400", 0, null);
				}
			} catch (Exception e) {
				
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
			}
			return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);
			
		}
				 
		 @PostMapping("/updateDateOfBirth")
		public ResponseObject updatedateofbirth(@RequestBody String json) {
		ObjectMapper mapper = new ObjectMapper();
			try {
		
			Map<String, Object> map = null;
				map = mapper.readValue(json, Map.class);
			        int id = (int) map.get("id");
			        String dateofbirth = (String) map.get("dateofbirth");
			        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
			        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			        String newDate = LocalDate.parse(dateofbirth, formatter).format(formatter2);
			        if(newDate.equals(null)  || id != 0 || !newDate.isEmpty()) {
					int updateDetails = userService.updateDateOfBirth(newDate,id);
					if(updateDetails != 0) {
						return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
					}
				return appUtils.prepareResponse("Data not updated sucessfull", "Failed", "400", 0, null);
			        }
				} catch (Exception e) {
					e.printStackTrace();
					return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
				} 
			   return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);
		 }
	  
		 @PostMapping("/updateState")
			public ResponseObject updatestate(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
			
				Map<String, Object> map = null;
					map = mapper.readValue(json, Map.class);
			        int id =(int) map.get("id");
			        String state = (String) map.get("state");
			        if(state != null && id != 0 && !state.isEmpty()) {
				  int updateDetails = userService.updateState(state,id);
					if(updateDetails != 0) {
						return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
					}
				return appUtils.prepareResponse("Data not updated sucessfull", "Failed", "400", 0, null);
			        }
				} catch (Exception e) {
				return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
				} 
			
			 return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);
		 }
	     
		 
		 @PostMapping("/updatePincode")
			public ResponseObject updatecountry(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
			
				Map<String, Object> map = null;
					map = mapper.readValue(json, Map.class);
			        int id = (int) map.get("id");
			        Integer pincode = (int) map.get("pincode");
			        if(pincode.equals(null)  || id != 0 ) {
			       int updateDetails = userService.updatePincode(pincode,id);
			           if(updateDetails != 0) {
						return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
					}
				return appUtils.prepareResponse("Data not updated sucessfull", "Failed", "400", 0, null);
			        }
				} catch (Exception e) {
					return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
				} 
			 return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);
		 }
		 
		 
		 @PostMapping("/updateMaritalStatus")
			public ResponseObject updatemaritalStatus(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
			
				Map<String, Object> map = null;
					map = mapper.readValue(json, Map.class);
			       int id = (int) map.get("id");
			        String maritalStatus = (String) map.get("maritalStatus");
			        if(maritalStatus != null && id != 0 && !maritalStatus.isEmpty()) {
			        int updateDetails = userService.updateMaritalStatus(maritalStatus,id);
					if(updateDetails != 0) {
						return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
					}
				return appUtils.prepareResponse("Data not updated sucessfull", "Failed", "400", 0, null);
			        }
			}catch (Exception e) {
					return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
				}
			return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);

		 }
		 
		 @PostMapping("/updateHeight")
			public ResponseObject updateheight(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
			
				Map<String, Object> map = null;
					map = mapper.readValue(json, Map.class);
			       int id = (int) map.get("id");
			        Integer height = (int) map.get("height");
			        if(height.equals(null)  || id != 0 ) {
			        int updateDetails = userService.updateHeight(height,id);
					if(updateDetails != 0) {
						return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
					}
				return appUtils.prepareResponse("Data not updated sucessfull", "Failed", "400", 0, null);
			        }	        
				} catch (Exception e) {
					return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
				} 
				
				return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);
			}
		 
		 
		 @PostMapping("/updateWeight")
			public ResponseObject updateweight(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
			      Map<String, Object> map = null;
					map = mapper.readValue(json, Map.class);
			        int id = (int) map.get("id");
			        Integer weight = (int) map.get("weight");
			        if(weight.equals(null)  || id != 0 ) {
			        int updateDetails = userService.updateWeight(weight,id);
					if(updateDetails != 0) {
						return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
					}
				return appUtils.prepareResponse("Data not updated sucessfull", "Failed", "400", 0, null);
			        }
				} catch (Exception e) {
					return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
				} 
			          
				return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);
		 }
		 
		 @PostMapping("/updateSmokingStatus")
			public ResponseObject updatesmoking(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
			
				Map<String, Object> map = null;
					map = mapper.readValue(json, Map.class);
					 int id = (int) map.get("id");
			        String smoking = (String) map.get("smoking");
			        if(smoking != null && id != 0 && !smoking.isEmpty()) {
					int updateDetails = userService.updateSmokingStatus(smoking,id);
					if(updateDetails != 0) {
						return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
					}
				return appUtils.prepareResponse("Data not updated sucessfull", "Failed", "400", 0, null);
			        }
				} catch (Exception e) {
					return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
				} 
			return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);
		 }
		 
		 
		 @PostMapping("/updateAlocholStatus")
			public ResponseObject updatealochol(@RequestBody String json) {
			ObjectMapper mapper = new ObjectMapper();
			try {
			
				Map<String, Object> map = null;
					map = mapper.readValue(json, Map.class);
			      int id =(int) map.get("id");
			       String alochol = (String) map.get("alochol");
			        if(alochol != null && id != 0 && !alochol.isEmpty()) {
					int updateDetails = userService.updateAlocholStatus(alochol,id);
					if(updateDetails != 0) {
						return appUtils.prepareResponse("Data updated sucessfully", "success", "200", 1, null);
					}
				return appUtils.prepareResponse("Data not updated sucessfull", "Failed", "400", 0, null);
			        }
				
				} catch (Exception e) {
					return appUtils.prepareResponse("some error occured", "failed", "500", 0, null);
				} 
			return appUtils.prepareResponse("Failed to update data", "failed", "500", 0, null);
		 }
}