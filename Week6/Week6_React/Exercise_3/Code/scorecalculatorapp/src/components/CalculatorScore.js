import "../styles/mystyle.css";

const percentToDecimal = (decimal) => {
    return decimal.toFixed(2) + "%";
}
const calcScore = (total,goal) => {
    return percentToDecimal(total/goal);
}

export const CalculatorScore= ({name,school,total,goal}) => {
    return(
        <div className="formatstyle">
            <h1><font color="brown">Student Details</font></h1>
            <div className="Name">
                <b><span>Name: </span></b>
                <span>{name}</span>
            </div>
             <div className="school">
                <b><span>School: </span></b>
                <span>{school}</span>
            </div>
             <div className="Total">
                <b><span>Total: </span></b>
                <span>{total}</span>
                <span>Marks</span>
            </div>
            <div className="Score">
                <b>Score: </b>
                <span>
                    {calcScore(total,goal)}
                </span>
            </div>
        </div>
    )
}
