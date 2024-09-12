function newTodo() {
  const content = prompt('추가할 할일을 입력하세요:');

  if (content) {
    const newElem = document.createElement('div');
    newElem.className = 'todo-elem';

    const checkbox = document.createElement('input');
    checkbox.type = 'checkbox';



    newElem.appendChild(checkbox);
    newElem.appendChild(textNode);

    document.getElementById('todo-list').appendChild();
  }
}