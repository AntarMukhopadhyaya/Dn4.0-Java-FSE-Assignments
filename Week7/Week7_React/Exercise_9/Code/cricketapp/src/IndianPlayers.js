import React from "react";

const IndianPlayers = () => {
  // Suppose these are Indian players in order
  const indianPlayers = [
    "Rohit Sharma",
    "Virat Kohli",
    "KL Rahul",
    "Shubman Gill",
    "Suryakumar Yadav",
    "Hardik Pandya",
    "Rishabh Pant",
    "Jasprit Bumrah",
    "Mohammed Siraj",
    "Yuzvendra Chahal",
    "Ishan Kishan",
  ];

  // Destructure to get individual positions (using rest for demonstration)
  const [
    player1,
    player2,
    player3,
    player4,
    player5,
    player6,
    player7,
    player8,
    player9,
    player10,
    player11,
  ] = indianPlayers;

  const oddTeam = [player1, player3, player5, player7, player9, player11];
  const evenTeam = [player2, player4, player6, player8, player10];

  // Two arrays to merge
  const T20players = ["Hardik Pandya", "Suryakumar Yadav", "Rohit Sharma"];
  const RanjiTrophyPlayers = ["KL Rahul", "Shubman Gill", "Rishabh Pant"];

  // Merge using spread (ES6)
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div className="component-box">
      <h2>Indian Players</h2>

      <div>
        <h3>Odd Team Players (by position):</h3>
        <ul>
          {oddTeam.map((p, i) => (
            <li key={`odd-${i}`}>{p}</li>
          ))}
        </ul>
      </div>

      <div>
        <h3>Even Team Players (by position):</h3>
        <ul>
          {evenTeam.map((p, i) => (
            <li key={`even-${i}`}>{p}</li>
          ))}
        </ul>
      </div>

      <div>
        <h3>Merged Players (T20 + Ranji Trophy):</h3>
        <ul>
          {mergedPlayers.map((p, i) => (
            <li key={`merged-${i}`}>{p}</li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default IndianPlayers;
