/**
 * Copyright (C) 2015 Asterios Raptis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.alpharogroup.random.api;

/**
 * The interface {@link LocationGenerator} for generate location data.
 */
public interface LocationGenerator {

    /**
     * New street name.
     *
     * @return the string
     */
    String newStreetName();

    /**
     * New street number.
     *
     * @return the string
     */
    String newStreetNumber();

    /**
     * New zip code.
     *
     * @return the string
     */
    String newZipCode();

    /**
     * New city.
     *
     * @return the string
     */
    String newCity();

    /**
     * New state.
     *
     * @return the string
     */
    String newState();

    /**
     * New country.
     *
     * @return the string
     */
    String newCountry();

    /**
     * New longitude.
     *
     * @return the string
     */
    String newLongitude();

    /**
     * New latitude.
     *
     * @return the string
     */
    String newLatitude();

    /**
     * New address comment.
     *
     * @return the string
     */
    String newAddressComment();
}