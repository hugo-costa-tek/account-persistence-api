package com.demo.account.service.api.account;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Address value object
 *
 * @author Hugo Costa
 * @since 1.0.0
 */
@Getter
@RequiredArgsConstructor( access = AccessLevel.PACKAGE )
public class Address {

	private final String city;

	private final String country;
}
