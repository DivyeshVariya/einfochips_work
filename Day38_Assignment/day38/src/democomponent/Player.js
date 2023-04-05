import React from 'react'

const Player = ({player}) => {
  return (
    <div>
        <h2>{player.id}---{player.name}---{player.country}---{player.runs}</h2>
    </div>
  )
}

export default Player