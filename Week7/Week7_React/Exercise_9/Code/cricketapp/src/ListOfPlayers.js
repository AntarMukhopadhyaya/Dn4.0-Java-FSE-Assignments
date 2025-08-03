export const ListofPlayers = () => {
  const players = [
    { name: "Rohit Sharma", score: 85 },
    { name: "Virat Kohli", score: 92 },
    { name: "KL Rahul", score: 68 },
    { name: "Shubman Gill", score: 74 },
    { name: "Suryakumar Yadav", score: 55 },
    { name: "Hardik Pandya", score: 33 },
    { name: "Rishabh Pant", score: 78 },
    { name: "Jasprit Bumrah", score: 10 },
    { name: "Mohammed Siraj", score: 22 },
    { name: "Yuzvendra Chahal", score: 45 },
    { name: "Ishan Kishan", score: 71 },
  ];
  const playerList = players.map((player, index) => (
    <li key={index}>
      {player.name} - Score: {player.score}
    </li>
  ));
  const belowEighty = players
    .filter((player) => player.score < 80)
    .map((player, index) => (
      <li key={index}>
        {player.name} - Score: {player.score}
      </li>
    ));
  return (
    <div className="component-box">
      <h2>List of Players</h2>
      <p> All 11 Players:</p>
      <ul>{playerList}</ul>
      <p>Players with score below 80:</p>
      <ul>{belowEighty}</ul>
    </div>
  );
};
