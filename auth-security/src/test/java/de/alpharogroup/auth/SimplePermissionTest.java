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
package de.alpharogroup.auth;

import java.io.File;
import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import de.alpharogroup.auth.interfaces.Permission;
import de.alpharogroup.file.csv.CsvFileExtensions;
import de.alpharogroup.file.search.PathFinder;

/**
 * Test class for the class SimplePermissionTest.
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public class SimplePermissionTest
{

	/** The permissions. */
	List<String> permissions;

	/**
	 * Sets up method will be invoked before every unit test method in this class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	protected void setUp() throws Exception
	{
		final File srctestresDir = PathFinder.getSrcTestResourcesDir();
		final File resources = new File(srctestresDir, "resources");
		final File userrole = new File(resources, "userrole");
		this.permissions = CsvFileExtensions.readFileToList(userrole);
	}

	/**
	 * Tear down method will be invoked after every unit test method in this class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@AfterMethod
	protected void tearDown() throws Exception
	{
	}

	/**
	 * Test method for {@link de.alpharogroup.auth.SimplePermission#getDescription()}.
	 */
	@Test
	public void testGetDescription()
	{
		final Permission ar = new SimplePermission();
		final String expected = "read data from table rooms";
		final String far = this.permissions.get(0);
		ar.setDescription(far);
		ar.setPermissionName(far);
		final String compare = far;
		final boolean result = expected.equals(compare);
		AssertJUnit.assertTrue("", result);
	}

	/**
	 * Test method for {@link de.alpharogroup.auth.SimplePermission#getPermissionName()}.
	 */
	@Test
	public void testGetName()
	{
		final Permission ar = new SimplePermission();
		final String expected = "read data from table rooms";
		final String far = this.permissions.get(0);
		ar.setDescription(far);
		ar.setPermissionName(far);
		final String compare = far;
		final boolean result = expected.equals(compare);
		AssertJUnit.assertTrue("", result);
	}

}
