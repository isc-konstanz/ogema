/**
 * This file is part of OGEMA.
 *
 * OGEMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OGEMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OGEMA. If not, see <http://www.gnu.org/licenses/>.
 */
package org.ogema.frameworkadministration.json.post;

import java.io.Serializable;

/**
 *
 * @author tgries
 */
public class UserJsonCopyUser implements Serializable {

	private static final long serialVersionUID = -6121673993546972489L;

	private String userOld;
	private String userNew;
	private String pwd;

	public UserJsonCopyUser() {
	}

	public UserJsonCopyUser(String userOld, String userNew, String pwd) {
		this.userOld = userOld;
		this.userNew = userNew;
		this.pwd = pwd;
	}

	public String getUserOld() {
		return userOld;
	}

	public void setUserOld(String userOld) {
		this.userOld = userOld;
	}

	public String getUserNew() {
		return userNew;
	}

	public void setUserNew(String userNew) {
		this.userNew = userNew;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}