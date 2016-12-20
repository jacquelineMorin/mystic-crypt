/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.crypto.aes;

import de.alpharogroup.crypto.interfaces.GenericEncryptor;
import lombok.Builder;
import lombok.Getter;

/**
 * The Class ChainedEncryptor can take many {@code Encryptor} objects and encrypts the given string
 * with all the given {@code Encryptor} objects.
 */
@Builder
public class ChainedEncryptor implements GenericEncryptor<String, String>
{

	/** The encryptors. */
	@Getter
	private final GenericEncryptor<String, String>[] encryptors;

	/**
	 * Instantiates a new chained encryptor.
	 *
	 * @param encryptors
	 *            the encryptors
	 */
	@SafeVarargs
	public ChainedEncryptor(final GenericEncryptor<String, String>... encryptors)
	{
		this.encryptors = encryptors;
	}

	/**
	 * Encrypt the given String.
	 *
	 * @param string
	 *            The String to encrypt.
	 * @return The encrypted String.
	 * @throws Exception
	 *             is thrown if encryption fails.
	 */
	@Override
	public String encrypt(final String string) throws Exception
	{
		String result = string;
		for (final GenericEncryptor<String, String> encryptor : encryptors)
		{
			result = encryptor.encrypt(result);
		}
		return result;
	}
}
