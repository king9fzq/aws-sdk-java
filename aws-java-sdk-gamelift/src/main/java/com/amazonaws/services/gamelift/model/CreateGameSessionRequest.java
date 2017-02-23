/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGameSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet to create a game session in. Each request must reference either a fleet ID or alias
     * ID, but not both.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Unique identifier for an alias associated with the fleet to create a game session in. Each request must reference
     * either a fleet ID or alias ID, but not both.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     */
    private Integer maximumPlayerSessionCount;
    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Set of developer-defined properties for a game session. These properties are passed to the server process hosting
     * the game session.
     * </p>
     */
    private java.util.List<GameProperty> gameProperties;
    /**
     * <p>
     * $player-id; or entity creating the game session. This ID is used to enforce a resource protection policy (if one
     * exists) that limits the number of concurrent active game sessions one player can have.
     * </p>
     */
    private String creatorId;
    /**
     * <p>
     * Custom string to include in the game session ID, with a maximum length of 48 characters. A game session ID has
     * the following format: "arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;game session ID&gt;". If
     * provided, the custom string is used for the game session ID string. This value cannot be updated once a game
     * session is created.
     * </p>
     */
    private String gameSessionId;

    /**
     * <p>
     * Unique identifier for a fleet to create a game session in. Each request must reference either a fleet ID or alias
     * ID, but not both.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to create a game session in. Each request must reference either a fleet ID
     *        or alias ID, but not both.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to create a game session in. Each request must reference either a fleet ID or alias
     * ID, but not both.
     * </p>
     * 
     * @return Unique identifier for a fleet to create a game session in. Each request must reference either a fleet ID
     *         or alias ID, but not both.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to create a game session in. Each request must reference either a fleet ID or alias
     * ID, but not both.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to create a game session in. Each request must reference either a fleet ID
     *        or alias ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for an alias associated with the fleet to create a game session in. Each request must reference
     * either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for an alias associated with the fleet to create a game session in. Each request must
     *        reference either a fleet ID or alias ID, but not both.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * Unique identifier for an alias associated with the fleet to create a game session in. Each request must reference
     * either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @return Unique identifier for an alias associated with the fleet to create a game session in. Each request must
     *         reference either a fleet ID or alias ID, but not both.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * Unique identifier for an alias associated with the fleet to create a game session in. Each request must reference
     * either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for an alias associated with the fleet to create a game session in. Each request must
     *        reference either a fleet ID or alias ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players that can be connected simultaneously to the game session.
     */

    public void setMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        this.maximumPlayerSessionCount = maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @return Maximum number of players that can be connected simultaneously to the game session.
     */

    public Integer getMaximumPlayerSessionCount() {
        return this.maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players that can be connected simultaneously to the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a game session. Session names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Set of developer-defined properties for a game session. These properties are passed to the server process hosting
     * the game session.
     * </p>
     * 
     * @return Set of developer-defined properties for a game session. These properties are passed to the server process
     *         hosting the game session.
     */

    public java.util.List<GameProperty> getGameProperties() {
        return gameProperties;
    }

    /**
     * <p>
     * Set of developer-defined properties for a game session. These properties are passed to the server process hosting
     * the game session.
     * </p>
     * 
     * @param gameProperties
     *        Set of developer-defined properties for a game session. These properties are passed to the server process
     *        hosting the game session.
     */

    public void setGameProperties(java.util.Collection<GameProperty> gameProperties) {
        if (gameProperties == null) {
            this.gameProperties = null;
            return;
        }

        this.gameProperties = new java.util.ArrayList<GameProperty>(gameProperties);
    }

    /**
     * <p>
     * Set of developer-defined properties for a game session. These properties are passed to the server process hosting
     * the game session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameProperties(java.util.Collection)} or {@link #withGameProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gameProperties
     *        Set of developer-defined properties for a game session. These properties are passed to the server process
     *        hosting the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withGameProperties(GameProperty... gameProperties) {
        if (this.gameProperties == null) {
            setGameProperties(new java.util.ArrayList<GameProperty>(gameProperties.length));
        }
        for (GameProperty ele : gameProperties) {
            this.gameProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of developer-defined properties for a game session. These properties are passed to the server process hosting
     * the game session.
     * </p>
     * 
     * @param gameProperties
     *        Set of developer-defined properties for a game session. These properties are passed to the server process
     *        hosting the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withGameProperties(java.util.Collection<GameProperty> gameProperties) {
        setGameProperties(gameProperties);
        return this;
    }

    /**
     * <p>
     * $player-id; or entity creating the game session. This ID is used to enforce a resource protection policy (if one
     * exists) that limits the number of concurrent active game sessions one player can have.
     * </p>
     * 
     * @param creatorId
     *        $player-id; or entity creating the game session. This ID is used to enforce a resource protection policy
     *        (if one exists) that limits the number of concurrent active game sessions one player can have.
     */

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * <p>
     * $player-id; or entity creating the game session. This ID is used to enforce a resource protection policy (if one
     * exists) that limits the number of concurrent active game sessions one player can have.
     * </p>
     * 
     * @return $player-id; or entity creating the game session. This ID is used to enforce a resource protection policy
     *         (if one exists) that limits the number of concurrent active game sessions one player can have.
     */

    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * <p>
     * $player-id; or entity creating the game session. This ID is used to enforce a resource protection policy (if one
     * exists) that limits the number of concurrent active game sessions one player can have.
     * </p>
     * 
     * @param creatorId
     *        $player-id; or entity creating the game session. This ID is used to enforce a resource protection policy
     *        (if one exists) that limits the number of concurrent active game sessions one player can have.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withCreatorId(String creatorId) {
        setCreatorId(creatorId);
        return this;
    }

    /**
     * <p>
     * Custom string to include in the game session ID, with a maximum length of 48 characters. A game session ID has
     * the following format: "arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;game session ID&gt;". If
     * provided, the custom string is used for the game session ID string. This value cannot be updated once a game
     * session is created.
     * </p>
     * 
     * @param gameSessionId
     *        Custom string to include in the game session ID, with a maximum length of 48 characters. A game session ID
     *        has the following format:
     *        "arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;game session ID&gt;". If provided, the
     *        custom string is used for the game session ID string. This value cannot be updated once a game session is
     *        created.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * Custom string to include in the game session ID, with a maximum length of 48 characters. A game session ID has
     * the following format: "arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;game session ID&gt;". If
     * provided, the custom string is used for the game session ID string. This value cannot be updated once a game
     * session is created.
     * </p>
     * 
     * @return Custom string to include in the game session ID, with a maximum length of 48 characters. A game session
     *         ID has the following format:
     *         "arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;game session ID&gt;". If provided, the
     *         custom string is used for the game session ID string. This value cannot be updated once a game session is
     *         created.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * Custom string to include in the game session ID, with a maximum length of 48 characters. A game session ID has
     * the following format: "arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;game session ID&gt;". If
     * provided, the custom string is used for the game session ID string. This value cannot be updated once a game
     * session is created.
     * </p>
     * 
     * @param gameSessionId
     *        Custom string to include in the game session ID, with a maximum length of 48 characters. A game session ID
     *        has the following format:
     *        "arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;game session ID&gt;". If provided, the
     *        custom string is used for the game session ID string. This value cannot be updated once a game session is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId()).append(",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: ").append(getMaximumPlayerSessionCount()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getGameProperties() != null)
            sb.append("GameProperties: ").append(getGameProperties()).append(",");
        if (getCreatorId() != null)
            sb.append("CreatorId: ").append(getCreatorId()).append(",");
        if (getGameSessionId() != null)
            sb.append("GameSessionId: ").append(getGameSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGameSessionRequest == false)
            return false;
        CreateGameSessionRequest other = (CreateGameSessionRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getMaximumPlayerSessionCount() == null ^ this.getMaximumPlayerSessionCount() == null)
            return false;
        if (other.getMaximumPlayerSessionCount() != null && other.getMaximumPlayerSessionCount().equals(this.getMaximumPlayerSessionCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGameProperties() == null ^ this.getGameProperties() == null)
            return false;
        if (other.getGameProperties() != null && other.getGameProperties().equals(this.getGameProperties()) == false)
            return false;
        if (other.getCreatorId() == null ^ this.getCreatorId() == null)
            return false;
        if (other.getCreatorId() != null && other.getCreatorId().equals(this.getCreatorId()) == false)
            return false;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getMaximumPlayerSessionCount() == null) ? 0 : getMaximumPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGameProperties() == null) ? 0 : getGameProperties().hashCode());
        hashCode = prime * hashCode + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateGameSessionRequest clone() {
        return (CreateGameSessionRequest) super.clone();
    }

}
