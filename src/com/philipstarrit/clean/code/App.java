/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package com.philipstarrit.clean.code;

import com.google.common.collect.ImmutableList;
import com.philipstarrit.clean.code.builder.Account;
import com.philipstarrit.clean.code.builder.Address;
import com.philipstarrit.clean.code.builder.Name;

/**
 * @author fluxmeister
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Account account = new Account(1, "philip", null, "starritt", 50, "FooBar Road", "", "belfast", "cool@email.com");
		
		Name name = new Name.Builder().firstName("philip")
									  .middleNames(ImmutableList.of("peter"))
									  .surname("starritt")
									  .build();
		
		Address address = new Address.Builder().city("Belfast")
											   .houseNumber(111)
											   .zipCode("123")
											   .street("Belfast Street")
											   .build();
		
		Account account = new Account.Builder().address(address)
											  .name(name)
											  .email("philip@email.com")
											  .id(1)
											  .build();
		
		System.out.println(account);
		
	}

}
