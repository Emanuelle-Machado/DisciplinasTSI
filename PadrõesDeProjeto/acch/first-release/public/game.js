export default function createGame(){

    const state = {
        players: {},
        fruits: {},
        screen: {
            width: 10,
            height: 10
        }
    }

     //==================================================
    function addPlayer(command){

        const playerId = command.playerId
        const playerX = command.playerX
        const playerY = command.playerY

        state.players[playerId] = {
            x: playerX,
            y: playerY
        }
    }

    //==================================================
    function removePlayer(){

        const playerId = command.playerId
        delete state.players[playerId]
    }

    //==================================================
    function addFruit(command){

        const fruitId = command.fruitId
        const fruitX = command.fruitX
        const fruitY = command.fruitY

        state.fruits[fruitId] = {
            x: fruitX,
            y: fruitY
        }
    }

    //==================================================
    function removeFruit(){

        const fruitId = command.fruitId
        delete state.fruits[fruitId]
    }

    //==================================================
    function movePlayer(command){

        console.log('game.movePlayer() -> Moving ${command.playerId} with ${command.keyPressed}')
    
        //--------------------------------------------------
        const acceptedMoves = {
            ArrowUp(player){
                console.log('game.movePlayer().ArrowUp() -> Moving player Up')
                if(player.y - 1 >= 0){
                    player.y = player.y - 1
                }
            },
            ArrowRigth(player){
                console.log('Moving player Rigth')
                if(player.x + 1 < state.screen.width){
                    player.x = player.x + 1
                }
            },
            ArrowDown(player){
                console.log('Moving player Down')
                if(player.y + 1 < state.screen.height){
                    player.y = player.y + 1
                }
            },
            ArrowLeft(player){
                console.log('Moving player Left')
                if(player.x - 1 >= 0){
                    player.x = player.x - 1
                }
            }
        }

        //--------------------------------------------------
        const keyPressed = command.keyPressed
        const playerId = command.playerId
        const player = state.players[playerId]
        const moveFunction = acceptedMoves[keyPressed]

        //--------------------------------------------------
        if (player && moveFunction) {
            moveFunction(player)
            checkForFruitCollision(playerId)
        }
    }

    //==================================================
    function checkForFruitCollision(playerId){

        const player = state.players[playerId]

        for(const fruitId in state.fruits){
            const fruit = state.fruits[fruitId]
            console.log('Checking ${playerId} and ${fruitId}')

            if(player.x === fruit.x && player.y === fruit.y){
                console.log('COLLISION between ${playerId} and ${fruitId}')
                removeFruit({fruitId: fruitId})
            }
        }
    }

    return{
        addPlayer,
        removePlayer,
        movePlayer,
        addFruit,
        removeFruit,
        state
    }
}